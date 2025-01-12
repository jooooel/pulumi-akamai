// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyOutput extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyOutput Empty = new GetImagingPolicyImagePolicyOutput();

    @Import(name="adaptiveQuality")
    private @Nullable String adaptiveQuality;

    public Optional<String> adaptiveQuality() {
        return Optional.ofNullable(this.adaptiveQuality);
    }

    @Import(name="allowedFormats")
    private @Nullable List<String> allowedFormats;

    public Optional<List<String>> allowedFormats() {
        return Optional.ofNullable(this.allowedFormats);
    }

    @Import(name="forcedFormats")
    private @Nullable List<String> forcedFormats;

    public Optional<List<String>> forcedFormats() {
        return Optional.ofNullable(this.forcedFormats);
    }

    @Import(name="perceptualQuality")
    private @Nullable String perceptualQuality;

    public Optional<String> perceptualQuality() {
        return Optional.ofNullable(this.perceptualQuality);
    }

    @Import(name="perceptualQualityFloor")
    private @Nullable String perceptualQualityFloor;

    public Optional<String> perceptualQualityFloor() {
        return Optional.ofNullable(this.perceptualQualityFloor);
    }

    @Import(name="perceptualQualityVar")
    private @Nullable String perceptualQualityVar;

    public Optional<String> perceptualQualityVar() {
        return Optional.ofNullable(this.perceptualQualityVar);
    }

    @Import(name="quality")
    private @Nullable String quality;

    public Optional<String> quality() {
        return Optional.ofNullable(this.quality);
    }

    @Import(name="qualityVar")
    private @Nullable String qualityVar;

    public Optional<String> qualityVar() {
        return Optional.ofNullable(this.qualityVar);
    }

    private GetImagingPolicyImagePolicyOutput() {}

    private GetImagingPolicyImagePolicyOutput(GetImagingPolicyImagePolicyOutput $) {
        this.adaptiveQuality = $.adaptiveQuality;
        this.allowedFormats = $.allowedFormats;
        this.forcedFormats = $.forcedFormats;
        this.perceptualQuality = $.perceptualQuality;
        this.perceptualQualityFloor = $.perceptualQualityFloor;
        this.perceptualQualityVar = $.perceptualQualityVar;
        this.quality = $.quality;
        this.qualityVar = $.qualityVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyOutput $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyOutput();
        }

        public Builder(GetImagingPolicyImagePolicyOutput defaults) {
            $ = new GetImagingPolicyImagePolicyOutput(Objects.requireNonNull(defaults));
        }

        public Builder adaptiveQuality(@Nullable String adaptiveQuality) {
            $.adaptiveQuality = adaptiveQuality;
            return this;
        }

        public Builder allowedFormats(@Nullable List<String> allowedFormats) {
            $.allowedFormats = allowedFormats;
            return this;
        }

        public Builder allowedFormats(String... allowedFormats) {
            return allowedFormats(List.of(allowedFormats));
        }

        public Builder forcedFormats(@Nullable List<String> forcedFormats) {
            $.forcedFormats = forcedFormats;
            return this;
        }

        public Builder forcedFormats(String... forcedFormats) {
            return forcedFormats(List.of(forcedFormats));
        }

        public Builder perceptualQuality(@Nullable String perceptualQuality) {
            $.perceptualQuality = perceptualQuality;
            return this;
        }

        public Builder perceptualQualityFloor(@Nullable String perceptualQualityFloor) {
            $.perceptualQualityFloor = perceptualQualityFloor;
            return this;
        }

        public Builder perceptualQualityVar(@Nullable String perceptualQualityVar) {
            $.perceptualQualityVar = perceptualQualityVar;
            return this;
        }

        public Builder quality(@Nullable String quality) {
            $.quality = quality;
            return this;
        }

        public Builder qualityVar(@Nullable String qualityVar) {
            $.qualityVar = qualityVar;
            return this;
        }

        public GetImagingPolicyImagePolicyOutput build() {
            return $;
        }
    }

}
