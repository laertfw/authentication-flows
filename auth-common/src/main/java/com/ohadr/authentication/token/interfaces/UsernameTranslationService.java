package com.ohadr.authentication.token.interfaces;

import org.springframework.security.core.Authentication;

public interface UsernameTranslationService
{
	public String getUsernameFromAuthentication(Authentication authentication);
}
