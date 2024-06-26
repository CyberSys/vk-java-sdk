// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiClientVersionDeprecatedException extends ApiException {
    public static final Integer ERROR_CODE = 34;

    public static final String ERROR_DESCRIPTION = "Client version deprecated";

    public ApiClientVersionDeprecatedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiClientVersionDeprecatedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
