// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiFloodException extends ApiException {
    public static final Integer ERROR_CODE = 9;

    public static final String ERROR_DESCRIPTION = "Flood control";

    public ApiFloodException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiFloodException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
