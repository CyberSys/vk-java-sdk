// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiRecaptchaException extends ApiException {
    public static final Integer ERROR_CODE = 3300;

    public static final String ERROR_DESCRIPTION = "Recaptcha needed";

    public ApiRecaptchaException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiRecaptchaException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
