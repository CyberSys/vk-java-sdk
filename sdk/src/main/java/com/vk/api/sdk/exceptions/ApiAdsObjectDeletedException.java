// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAdsObjectDeletedException extends ApiException {
    public static final Integer ERROR_CODE = 629;

    public static final String ERROR_DESCRIPTION = "Object deleted";

    public ApiAdsObjectDeletedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAdsObjectDeletedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
