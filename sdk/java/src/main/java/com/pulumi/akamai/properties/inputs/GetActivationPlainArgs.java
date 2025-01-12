// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.properties.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActivationPlainArgs Empty = new GetActivationPlainArgs();

    @Import(name="network")
    private @Nullable String network;

    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="propertyId", required=true)
    private String propertyId;

    public String propertyId() {
        return this.propertyId;
    }

    @Import(name="version", required=true)
    private Integer version;

    public Integer version() {
        return this.version;
    }

    private GetActivationPlainArgs() {}

    private GetActivationPlainArgs(GetActivationPlainArgs $) {
        this.network = $.network;
        this.propertyId = $.propertyId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActivationPlainArgs $;

        public Builder() {
            $ = new GetActivationPlainArgs();
        }

        public Builder(GetActivationPlainArgs defaults) {
            $ = new GetActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder network(@Nullable String network) {
            $.network = network;
            return this;
        }

        public Builder propertyId(String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder version(Integer version) {
            $.version = version;
            return this;
        }

        public GetActivationPlainArgs build() {
            $.propertyId = Objects.requireNonNull($.propertyId, "expected parameter 'propertyId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
