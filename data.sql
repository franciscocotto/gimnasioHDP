--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6
-- Dumped by pg_dump version 10.6

-- Started on 2018-11-19 10:55:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2817 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 199 (class 1259 OID 16567)
-- Name: Cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Cliente" (
    id_campo integer NOT NULL,
    nombre character varying(20),
    apellidos character varying(20),
    sexo character varying(10),
    edad numeric(3,0),
    dui character varying(10),
    nit character varying(18),
    fechaingreso character varying(20),
    membresia integer
);


ALTER TABLE public."Cliente" OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 16565)
-- Name: Cliente_id_campo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Cliente_id_campo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Cliente_id_campo_seq" OWNER TO postgres;

--
-- TOC entry 2818 (class 0 OID 0)
-- Dependencies: 198
-- Name: Cliente_id_campo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Cliente_id_campo_seq" OWNED BY public."Cliente".id_campo;


--
-- TOC entry 197 (class 1259 OID 16556)
-- Name: membresia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.membresia (
    id_membresia integer NOT NULL,
    nombremembresia character varying(30),
    descripcion character varying(300),
    costo character varying(10),
    beneficios character varying(300)
);


ALTER TABLE public.membresia OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 16554)
-- Name: membresia_id_membresia_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.membresia_id_membresia_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.membresia_id_membresia_seq OWNER TO postgres;

--
-- TOC entry 2819 (class 0 OID 0)
-- Dependencies: 196
-- Name: membresia_id_membresia_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.membresia_id_membresia_seq OWNED BY public.membresia.id_membresia;


--
-- TOC entry 2678 (class 2604 OID 16570)
-- Name: Cliente id_campo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cliente" ALTER COLUMN id_campo SET DEFAULT nextval('public."Cliente_id_campo_seq"'::regclass);


--
-- TOC entry 2677 (class 2604 OID 16559)
-- Name: membresia id_membresia; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.membresia ALTER COLUMN id_membresia SET DEFAULT nextval('public.membresia_id_membresia_seq'::regclass);


--
-- TOC entry 2809 (class 0 OID 16567)
-- Dependencies: 199
-- Data for Name: Cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Cliente" (id_campo, nombre, apellidos, sexo, edad, dui, nit, fechaingreso, membresia) FROM stdin;
\.


--
-- TOC entry 2807 (class 0 OID 16556)
-- Dependencies: 197
-- Data for Name: membresia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.membresia (id_membresia, nombremembresia, descripcion, costo, beneficios) FROM stdin;
\.


--
-- TOC entry 2820 (class 0 OID 0)
-- Dependencies: 198
-- Name: Cliente_id_campo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Cliente_id_campo_seq"', 1, false);


--
-- TOC entry 2821 (class 0 OID 0)
-- Dependencies: 196
-- Name: membresia_id_membresia_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.membresia_id_membresia_seq', 1, false);


--
-- TOC entry 2682 (class 2606 OID 16572)
-- Name: Cliente Cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY (id_campo);


--
-- TOC entry 2680 (class 2606 OID 16564)
-- Name: membresia membresia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.membresia
    ADD CONSTRAINT membresia_pkey PRIMARY KEY (id_membresia);


--
-- TOC entry 2683 (class 1259 OID 16578)
-- Name: fki_fk_id_membresia; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_id_membresia ON public."Cliente" USING btree (membresia);


--
-- TOC entry 2684 (class 2606 OID 16573)
-- Name: Cliente fk_id_membresia; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT fk_id_membresia FOREIGN KEY (membresia) REFERENCES public.membresia(id_membresia);


-- Completed on 2018-11-19 10:55:40

--
-- PostgreSQL database dump complete
--

