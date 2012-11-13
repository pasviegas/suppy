-- Table: currency

-- DROP TABLE currency;

CREATE TABLE currency
(
  currencyid integer NOT NULL,
  name text,
  CONSTRAINT currency_pk PRIMARY KEY (currencyid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE currency
  OWNER TO postgres;
  
-- Table: stockkeepingunit

-- DROP TABLE stockkeepingunit;

CREATE TABLE stockkeepingunit
(
  stockkeepingunitid integer NOT NULL,
  name text,
  CONSTRAINT stockkeepingunit_pk PRIMARY KEY (stockkeepingunitid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE stockkeepingunit
  OWNER TO postgres;

-- Table: country

-- DROP TABLE country;

CREATE TABLE country
(
  countryid integer NOT NULL,
  name text,
  currencyid integer,
  CONSTRAINT country_pk PRIMARY KEY (countryid),
  CONSTRAINT country_currency_fk FOREIGN KEY (currencyid)
      REFERENCES currency (currencyid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT country_name_uk UNIQUE (name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE country
  OWNER TO postgres;

-- Table: "user"

-- DROP TABLE "user";

CREATE TABLE "user"
(
  userid integer NOT NULL,
  name text,
  email text,
  password text,
  countryid integer,
  CONSTRAINT user_pk PRIMARY KEY (userid),
  CONSTRAINT user_country_fk FOREIGN KEY (countryid)
      REFERENCES country (countryid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT user_email_uk UNIQUE (email)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "user"
  OWNER TO postgres;
