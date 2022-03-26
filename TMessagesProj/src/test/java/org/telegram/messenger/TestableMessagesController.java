package org.telegram.messenger;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class TestableMessagesController extends MessagesController {
    public static final String DC_DOMAIN_NAME_TAPV_3_STEL_COM = "tapv3.stel.com";
    public static final String DC_DOMAIN_NAME_APV_3_STEL_COM = "apv3.stel.com";
    public static String dcDomainName2 = DC_DOMAIN_NAME_TAPV_3_STEL_COM;

    public TestableMessagesController(int num) {
        super(num);
    }

    @NotNull
    @Override
    protected String getDcDomainName2() {
        return dcDomainName2;
    }
}
