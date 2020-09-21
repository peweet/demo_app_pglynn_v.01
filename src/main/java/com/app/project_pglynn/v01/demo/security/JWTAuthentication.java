package com.app.project_pglynn.v01.demo.security;
/*import com.app.project_pglynn.v01.demo.models.User;
import com.auth0.jwt.JWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import static com.app.project_pglynn.v01.demo.security.SecurityConstants.*;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;


//this code was entirely taken from https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/#Securing-RESTful-APIs-with-JWTs
public class JWTAuthentication extends UsernamePasswordAuthenticationFilter  {
    private AuthenticationManager authenticationManager;


    public JWTAuthentication(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
        try {
            User credentials = new ObjectMapper()
                    .readValue(req.getInputStream(), User.class);

            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            credentials.getUsername(),
                            credentials.getPassword(),
                            new ArrayList<>())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
        protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res,
                FilterChain chain,
                Authentication auth) throws IOException, ServletException {

            String token = JWT.create()
                    .withSubject(((User) auth.getPrincipal()).getUsername())
                    .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .sign(HMAC512(SECRET.getBytes()));
                     res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
        }
}

 */
