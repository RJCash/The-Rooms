--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;
SET default_tablespace = '';
SET default_with_oids = false;
--
-- Name: meeting; Type: TABLE; Schema: public; Owner: Gavin
--
CREATE TABLE meeting (
    list_name character varying(41),
    list_slug integer,
    list_notes character varying(877),
    list_updated date,
    list_url character varying(44),
    list_time character varying(8),
    list_day character varying(9),
    list_types character varying(5),
    list_address character varying(30),
    list_city character varying(13),
    list_state character varying(2),
    list_postal_code integer,
    list_country character varying(2),
    list_latitude numeric(15,13),
    list_longitude numeric(12,10),
    list_region character varying(13),
    list_timezone character varying(16),
    list_location character varying(49),
    list_location_notes character varying(168)
);


