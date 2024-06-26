// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiGroupTooManyOfficersException extends ApiException {
    public static final Integer ERROR_CODE = 702;

    public static final String ERROR_DESCRIPTION = "Too many officers in club";

    public ApiGroupTooManyOfficersException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiGroupTooManyOfficersException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
