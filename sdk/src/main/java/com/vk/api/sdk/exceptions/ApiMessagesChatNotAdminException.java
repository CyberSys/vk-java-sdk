// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesChatNotAdminException extends ApiException {
    public static final Integer ERROR_CODE = 925;

    public static final String ERROR_DESCRIPTION = "You are not admin of this chat";

    public ApiMessagesChatNotAdminException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesChatNotAdminException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
