// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyVideoPolicyBreakpointsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyVideoPolicyBreakpointsArgs Empty = new GetImagingPolicyVideoPolicyBreakpointsArgs();

    @Import(name="widths")
    private @Nullable Output<List<Integer>> widths;

    public Optional<Output<List<Integer>>> widths() {
        return Optional.ofNullable(this.widths);
    }

    private GetImagingPolicyVideoPolicyBreakpointsArgs() {}

    private GetImagingPolicyVideoPolicyBreakpointsArgs(GetImagingPolicyVideoPolicyBreakpointsArgs $) {
        this.widths = $.widths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyBreakpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyBreakpointsArgs $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyBreakpointsArgs();
        }

        public Builder(GetImagingPolicyVideoPolicyBreakpointsArgs defaults) {
            $ = new GetImagingPolicyVideoPolicyBreakpointsArgs(Objects.requireNonNull(defaults));
        }

        public Builder widths(@Nullable Output<List<Integer>> widths) {
            $.widths = widths;
            return this;
        }

        public Builder widths(List<Integer> widths) {
            return widths(Output.of(widths));
        }

        public Builder widths(Integer... widths) {
            return widths(List.of(widths));
        }

        public GetImagingPolicyVideoPolicyBreakpointsArgs build() {
            return $;
        }
    }

}