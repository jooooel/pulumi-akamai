// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationContrastArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationContrastArgs Empty = new GetImagingPolicyImagePolicyTransformationContrastArgs();

    @Import(name="brightness")
    private @Nullable Output<String> brightness;

    public Optional<Output<String>> brightness() {
        return Optional.ofNullable(this.brightness);
    }

    @Import(name="brightnessVar")
    private @Nullable Output<String> brightnessVar;

    public Optional<Output<String>> brightnessVar() {
        return Optional.ofNullable(this.brightnessVar);
    }

    @Import(name="contrast")
    private @Nullable Output<String> contrast;

    public Optional<Output<String>> contrast() {
        return Optional.ofNullable(this.contrast);
    }

    @Import(name="contrastVar")
    private @Nullable Output<String> contrastVar;

    public Optional<Output<String>> contrastVar() {
        return Optional.ofNullable(this.contrastVar);
    }

    private GetImagingPolicyImagePolicyTransformationContrastArgs() {}

    private GetImagingPolicyImagePolicyTransformationContrastArgs(GetImagingPolicyImagePolicyTransformationContrastArgs $) {
        this.brightness = $.brightness;
        this.brightnessVar = $.brightnessVar;
        this.contrast = $.contrast;
        this.contrastVar = $.contrastVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationContrastArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationContrastArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationContrastArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationContrastArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationContrastArgs(Objects.requireNonNull(defaults));
        }

        public Builder brightness(@Nullable Output<String> brightness) {
            $.brightness = brightness;
            return this;
        }

        public Builder brightness(String brightness) {
            return brightness(Output.of(brightness));
        }

        public Builder brightnessVar(@Nullable Output<String> brightnessVar) {
            $.brightnessVar = brightnessVar;
            return this;
        }

        public Builder brightnessVar(String brightnessVar) {
            return brightnessVar(Output.of(brightnessVar));
        }

        public Builder contrast(@Nullable Output<String> contrast) {
            $.contrast = contrast;
            return this;
        }

        public Builder contrast(String contrast) {
            return contrast(Output.of(contrast));
        }

        public Builder contrastVar(@Nullable Output<String> contrastVar) {
            $.contrastVar = contrastVar;
            return this;
        }

        public Builder contrastVar(String contrastVar) {
            return contrastVar(Output.of(contrastVar));
        }

        public GetImagingPolicyImagePolicyTransformationContrastArgs build() {
            return $;
        }
    }

}
