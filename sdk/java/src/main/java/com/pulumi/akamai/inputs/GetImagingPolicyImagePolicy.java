// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyBreakpoints;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyOutput;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformation;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformation;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyVariable;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicy Empty = new GetImagingPolicyImagePolicy();

    @Import(name="breakpoints")
    private @Nullable GetImagingPolicyImagePolicyBreakpoints breakpoints;

    public Optional<GetImagingPolicyImagePolicyBreakpoints> breakpoints() {
        return Optional.ofNullable(this.breakpoints);
    }

    @Import(name="hosts")
    private @Nullable List<String> hosts;

    public Optional<List<String>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    @Import(name="output")
    private @Nullable GetImagingPolicyImagePolicyOutput output;

    public Optional<GetImagingPolicyImagePolicyOutput> output() {
        return Optional.ofNullable(this.output);
    }

    @Import(name="postBreakpointTransformations")
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformation> postBreakpointTransformations;

    public Optional<List<GetImagingPolicyImagePolicyPostBreakpointTransformation>> postBreakpointTransformations() {
        return Optional.ofNullable(this.postBreakpointTransformations);
    }

    @Import(name="rolloutDuration")
    private @Nullable String rolloutDuration;

    public Optional<String> rolloutDuration() {
        return Optional.ofNullable(this.rolloutDuration);
    }

    @Import(name="transformations")
    private @Nullable List<GetImagingPolicyImagePolicyTransformation> transformations;

    public Optional<List<GetImagingPolicyImagePolicyTransformation>> transformations() {
        return Optional.ofNullable(this.transformations);
    }

    @Import(name="variables")
    private @Nullable List<GetImagingPolicyImagePolicyVariable> variables;

    public Optional<List<GetImagingPolicyImagePolicyVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetImagingPolicyImagePolicy() {}

    private GetImagingPolicyImagePolicy(GetImagingPolicyImagePolicy $) {
        this.breakpoints = $.breakpoints;
        this.hosts = $.hosts;
        this.output = $.output;
        this.postBreakpointTransformations = $.postBreakpointTransformations;
        this.rolloutDuration = $.rolloutDuration;
        this.transformations = $.transformations;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicy $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicy();
        }

        public Builder(GetImagingPolicyImagePolicy defaults) {
            $ = new GetImagingPolicyImagePolicy(Objects.requireNonNull(defaults));
        }

        public Builder breakpoints(@Nullable GetImagingPolicyImagePolicyBreakpoints breakpoints) {
            $.breakpoints = breakpoints;
            return this;
        }

        public Builder hosts(@Nullable List<String> hosts) {
            $.hosts = hosts;
            return this;
        }

        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        public Builder output(@Nullable GetImagingPolicyImagePolicyOutput output) {
            $.output = output;
            return this;
        }

        public Builder postBreakpointTransformations(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformation> postBreakpointTransformations) {
            $.postBreakpointTransformations = postBreakpointTransformations;
            return this;
        }

        public Builder postBreakpointTransformations(GetImagingPolicyImagePolicyPostBreakpointTransformation... postBreakpointTransformations) {
            return postBreakpointTransformations(List.of(postBreakpointTransformations));
        }

        public Builder rolloutDuration(@Nullable String rolloutDuration) {
            $.rolloutDuration = rolloutDuration;
            return this;
        }

        public Builder transformations(@Nullable List<GetImagingPolicyImagePolicyTransformation> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(GetImagingPolicyImagePolicyTransformation... transformations) {
            return transformations(List.of(transformations));
        }

        public Builder variables(@Nullable List<GetImagingPolicyImagePolicyVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetImagingPolicyImagePolicyVariable... variables) {
            return variables(List.of(variables));
        }

        public GetImagingPolicyImagePolicy build() {
            return $;
        }
    }

}