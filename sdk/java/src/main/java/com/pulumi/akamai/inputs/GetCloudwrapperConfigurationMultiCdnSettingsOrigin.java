// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsOrigin extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsOrigin Empty = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin();

    @Import(name="hostname", required=true)
    private String hostname;

    public String hostname() {
        return this.hostname;
    }

    @Import(name="originId", required=true)
    private String originId;

    public String originId() {
        return this.originId;
    }

    @Import(name="propertyId", required=true)
    private Integer propertyId;

    public Integer propertyId() {
        return this.propertyId;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsOrigin() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsOrigin(GetCloudwrapperConfigurationMultiCdnSettingsOrigin $) {
        this.hostname = $.hostname;
        this.originId = $.originId;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsOrigin $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsOrigin defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin(Objects.requireNonNull(defaults));
        }

        public Builder hostname(String hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder originId(String originId) {
            $.originId = originId;
            return this;
        }

        public Builder propertyId(Integer propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsOrigin build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            $.propertyId = Objects.requireNonNull($.propertyId, "expected parameter 'propertyId' to be non-null");
            return $;
        }
    }

}
