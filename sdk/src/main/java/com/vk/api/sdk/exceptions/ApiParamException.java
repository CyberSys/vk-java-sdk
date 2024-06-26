// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiParamException extends ApiException {
    public static final Integer ERROR_CODE = 100;

    public static final String ERROR_DESCRIPTION = "One of the parameters specified was missing or invalid";

    public ApiParamException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiParamException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
