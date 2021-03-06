package com.app.project_pglynn.v01.demo.security;

public class SecurityConstants {

        public static final String SECRET = "SecretKeyToGenJWTs";
        public static final long EXPIRATION_TIME = 864_000_000; // 10 days //900_000; =15 mins
        public static final String TOKEN_PREFIX = "Bearer ";
        public static final String HEADER_STRING = "Authorization";
        public static final String SIGN_UP_URL = "/users/sign-up";
    }

