// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey Empty = new GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey();

    @Import(name="authKeyName", required=true)
    private String authKeyName;

    public String authKeyName() {
        return this.authKeyName;
    }

    @Import(name="expiryDate", required=true)
    private String expiryDate;

    public String expiryDate() {
        return this.expiryDate;
    }

    @Import(name="headerName", required=true)
    private String headerName;

    public String headerName() {
        return this.headerName;
    }

    @Import(name="secret", required=true)
    private String secret;

    public String secret() {
        return this.secret;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey(GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey $) {
        this.authKeyName = $.authKeyName;
        this.expiryDate = $.expiryDate;
        this.headerName = $.headerName;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey(Objects.requireNonNull(defaults));
        }

        public Builder authKeyName(String authKeyName) {
            $.authKeyName = authKeyName;
            return this;
        }

        public Builder expiryDate(String expiryDate) {
            $.expiryDate = expiryDate;
            return this;
        }

        public Builder headerName(String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey build() {
            $.authKeyName = Objects.requireNonNull($.authKeyName, "expected parameter 'authKeyName' to be non-null");
            $.expiryDate = Objects.requireNonNull($.expiryDate, "expected parameter 'expiryDate' to be non-null");
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}