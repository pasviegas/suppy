/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pav.suppy.web.utils;

import java.io.OutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 *
 * @author rodrigokuntzer
 */
public class MappingJacksonJsonGZIPView extends MappingJacksonJsonView {

	private ObjectMapper objectMapper = new ObjectMapper();
	private JsonEncoding encoding = JsonEncoding.UTF8;
	private boolean prefixJson = false;
	private boolean gzipEnabled = true;

	@Override
	public void setEncoding(JsonEncoding encoding) {
		super.setEncoding(encoding);
		this.encoding = encoding;
	}

	@Override
	public void setObjectMapper(ObjectMapper objectMapper) {
		super.setObjectMapper(objectMapper);
		this.objectMapper = objectMapper;
	}

	@Override
	public void setPrefixJson(boolean prefixJson) {
		super.setPrefixJson(prefixJson);
		this.prefixJson = prefixJson;
	}

	public void setGzipEnabled(boolean gzipEnabled) {
		this.gzipEnabled = gzipEnabled;
	}
	
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Object value = filterModel(model);
		OutputStream os = response.getOutputStream();
		boolean canGzip = CacheUtils.acceptEncoding( "gzip", request );
		if(canGzip && this.gzipEnabled){
			response.setHeader( "Content-Encoding", "gzip" );
            os = new GZIPOutputStream(os);
		}
		try{
			JsonGenerator generator = this.objectMapper.getJsonFactory().createJsonGenerator(os, this.encoding);
			if (this.prefixJson) {
				generator.writeRaw("{} && ");
			}
			this.objectMapper.writeValue(generator, value);
		}finally{
			if(canGzip && this.gzipEnabled){
				os.close();
			}
		}
	}
	
}
