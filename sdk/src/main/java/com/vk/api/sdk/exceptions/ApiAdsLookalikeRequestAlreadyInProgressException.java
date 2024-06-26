// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAdsLookalikeRequestAlreadyInProgressException extends ApiException {
    public static final Integer ERROR_CODE = 630;

    public static final String ERROR_DESCRIPTION = "Lookalike request with same source already in progress";

    public ApiAdsLookalikeRequestAlreadyInProgressException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAdsLookalikeRequestAlreadyInProgressException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
