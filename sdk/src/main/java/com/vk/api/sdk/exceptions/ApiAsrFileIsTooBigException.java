// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAsrFileIsTooBigException extends ApiException {
    public static final Integer ERROR_CODE = 7702;

    public static final String ERROR_DESCRIPTION = "Audio file is too big";

    public ApiAsrFileIsTooBigException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAsrFileIsTooBigException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
