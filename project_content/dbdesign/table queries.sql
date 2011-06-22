/* USERS table */

CREATE TABLE "MYSHARE"."USERS"
  (
    "NAME"     VARCHAR2(100 BYTE) NOT NULL ENABLE,
    "LOGIN_ID" VARCHAR2(100 BYTE) NOT NULL ENABLE,
    "PASSWORD" VARCHAR2(20 BYTE) NOT NULL ENABLE,
    "EMAIL"    VARCHAR2(100 BYTE) NOT NULL ENABLE,
    "USER_ID"  NUMBER NOT NULL ENABLE,
    CONSTRAINT "USERS_PK" PRIMARY KEY ("USER_ID") USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645 PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT) TABLESPACE "USERS" ENABLE
  );