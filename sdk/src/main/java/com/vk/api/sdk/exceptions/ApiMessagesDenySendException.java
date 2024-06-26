// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesDenySendException extends ApiException {
    public static final Integer ERROR_CODE = 901;

    public static final String ERROR_DESCRIPTION = "Can't send messages for users without permission";

    public ApiMessagesDenySendException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesDenySendException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
