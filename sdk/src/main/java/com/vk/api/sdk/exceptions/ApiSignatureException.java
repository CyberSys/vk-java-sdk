// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiSignatureException extends ApiException {
    public static final Integer ERROR_CODE = 4;

    public static final String ERROR_DESCRIPTION = "Incorrect signature";

    public ApiSignatureException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiSignatureException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
