/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pav.suppy.web.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author rodrigokuntzer
 */
public class CacheUtils {
	private static final DateFormat HTTP_DATE_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

	private static final Logger _logger = LoggerFactory.getLogger(CacheUtils.class);
	static {
		HTTP_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT"));
	}

	public static boolean acceptEncoding(final String type, final HttpServletRequest request) {
		String encoding = request.getHeader("Accept-Encoding");
		return encoding != null
				&& encoding.indexOf(type) >= 0;
	}

	public static boolean checkCacheHeaderModifiedSince(HttpServletRequest request, HttpServletResponse response, Date dataAtual, int seconds) {
		String modifiedSince = request.getHeader("If-Modified-Since");
		try {
			if (modifiedSince != null) {
				Date dateModifiedSince = HTTP_DATE_FORMAT.parse(modifiedSince);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(dataAtual);
				calendar.add(Calendar.SECOND, seconds
						* -1);
				if (calendar.getTime().compareTo(dateModifiedSince) == -1) {
					handleNotModified(request, response, seconds);
					return true;
				}
			}
		}
		catch (Exception ex) {
			_logger.error("Erro no cache http", ex);
		}
		handleCacheHeaders(response, dataAtual, seconds);
		return false;
	}

	public static void handleCacheHeaders(HttpServletResponse response, Date dataAtual, int seconds) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataAtual);
		calendar.add(Calendar.SECOND, seconds);
		String dataAtualGMT = HTTP_DATE_FORMAT.format(dataAtual), dataExpiresGMT = HTTP_DATE_FORMAT.format(calendar.getTime());
		response.addHeader("Vary", "Accept-Encoding");
		response.setHeader("Cache-control", String.format("max-age=%d, pre-check=%d, post-check=%d", seconds, seconds, seconds));
		response.setHeader("Expires", dataExpiresGMT);
		response.setHeader("Last-Modified", dataAtualGMT);
		response.setHeader("Date", dataAtualGMT);
	}

	public static void handleDisableCache(HttpServletResponse response) {
		response.addHeader("Pragma", "no-cache");
		response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
		response.addDateHeader("Expires", 1L);
	}

	public static void handleNotModified(HttpServletRequest request, HttpServletResponse response, int seconds) throws Exception {
		String modifiedSince = request.getHeader("If-Modified-Since");
		Date dateModifiedSince = HTTP_DATE_FORMAT.parse(modifiedSince);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateModifiedSince);
		calendar.add(Calendar.SECOND, seconds);
		response.setHeader("Expires", HTTP_DATE_FORMAT.format(calendar.getTime()));
		response.setHeader("Last-Modified", modifiedSince);
		response.setStatus(304);
	}

	private CacheUtils() {
	}
}
