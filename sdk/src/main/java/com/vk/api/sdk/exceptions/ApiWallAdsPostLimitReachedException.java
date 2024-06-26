// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiWallAdsPostLimitReachedException extends ApiException {
    public static final Integer ERROR_CODE = 224;

    public static final String ERROR_DESCRIPTION = "Too many ads posts";

    public ApiWallAdsPostLimitReachedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiWallAdsPostLimitReachedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
