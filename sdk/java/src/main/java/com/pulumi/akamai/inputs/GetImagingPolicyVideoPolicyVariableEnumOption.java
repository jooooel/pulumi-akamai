// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImagingPolicyVideoPolicyVariableEnumOption extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyVideoPolicyVariableEnumOption Empty = new GetImagingPolicyVideoPolicyVariableEnumOption();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetImagingPolicyVideoPolicyVariableEnumOption() {}

    private GetImagingPolicyVideoPolicyVariableEnumOption(GetImagingPolicyVideoPolicyVariableEnumOption $) {
        this.id = $.id;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyVariableEnumOption $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyVariableEnumOption();
        }

        public Builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
            $ = new GetImagingPolicyVideoPolicyVariableEnumOption(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetImagingPolicyVideoPolicyVariableEnumOption build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}