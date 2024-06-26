// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketItemHasBadLinksException extends ApiException {
    public static final Integer ERROR_CODE = 1408;

    public static final String ERROR_DESCRIPTION = "Item has bad links in description";

    public ApiMarketItemHasBadLinksException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketItemHasBadLinksException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
