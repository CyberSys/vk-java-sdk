// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiWallAdsPublishedException extends ApiException {
    public static final Integer ERROR_CODE = 219;

    public static final String ERROR_DESCRIPTION = "Advertisement post was recently added";

    public ApiWallAdsPublishedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiWallAdsPublishedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
