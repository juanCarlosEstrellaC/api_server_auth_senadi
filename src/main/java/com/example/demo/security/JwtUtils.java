package com.example.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

    private long jwtExpirationMs = 31536000000L; // 1 año en milisegundos

	public String buildTokenJwt(String nombre) {
		return Jwts.builder().setSubject(nombre).setSubject("Hola mundo").setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + this.jwtExpirationMs)) // this.jwtExpirationMs
				.signWith(SignatureAlgorithm.HS512,
						"semillafckmsdmfmisofsfosofifisdefikiregi9483r84ruff8ufru87rg8ww322rrrrfsemillawdefrfgdtvgbomgobmdrb203290324825835824202405385358035edscfsdfsdfdsuio")
				.compact();

	}
}