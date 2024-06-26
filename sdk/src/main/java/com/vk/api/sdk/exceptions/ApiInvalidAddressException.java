// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiInvalidAddressException extends ApiException {
    public static final Integer ERROR_CODE = 1260;

    public static final String ERROR_DESCRIPTION = "Invalid screen name";

    public ApiInvalidAddressException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiInvalidAddressException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
