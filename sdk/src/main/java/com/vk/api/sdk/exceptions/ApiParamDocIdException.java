// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiParamDocIdException extends ApiException {
    public static final Integer ERROR_CODE = 1150;

    public static final String ERROR_DESCRIPTION = "Invalid document id";

    public ApiParamDocIdException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiParamDocIdException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
