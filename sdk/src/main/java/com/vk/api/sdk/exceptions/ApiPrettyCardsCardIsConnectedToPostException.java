// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiPrettyCardsCardIsConnectedToPostException extends ApiException {
    public static final Integer ERROR_CODE = 1902;

    public static final String ERROR_DESCRIPTION = "Card is connected to post";

    public ApiPrettyCardsCardIsConnectedToPostException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiPrettyCardsCardIsConnectedToPostException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
