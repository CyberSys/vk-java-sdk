// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiVideoAlreadyAddedException extends ApiException {
    public static final Integer ERROR_CODE = 800;

    public static final String ERROR_DESCRIPTION = "This video is already added";

    public ApiVideoAlreadyAddedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiVideoAlreadyAddedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
