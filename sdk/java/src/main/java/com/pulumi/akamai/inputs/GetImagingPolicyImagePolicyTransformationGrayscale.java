// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationGrayscale extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationGrayscale Empty = new GetImagingPolicyImagePolicyTransformationGrayscale();

    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="typeVar")
    private @Nullable String typeVar;

    public Optional<String> typeVar() {
        return Optional.ofNullable(this.typeVar);
    }

    private GetImagingPolicyImagePolicyTransformationGrayscale() {}

    private GetImagingPolicyImagePolicyTransformationGrayscale(GetImagingPolicyImagePolicyTransformationGrayscale $) {
        this.type = $.type;
        this.typeVar = $.typeVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationGrayscale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationGrayscale $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationGrayscale();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationGrayscale defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationGrayscale(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder typeVar(@Nullable String typeVar) {
            $.typeVar = typeVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationGrayscale build() {
            return $;
        }
    }

}