// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs Empty = new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs();

    @Import(name="transformation")
    private @Nullable Output<GetImagingPolicyImagePolicyTransformationArgs> transformation;

    public Optional<Output<GetImagingPolicyImagePolicyTransformationArgs>> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    @Import(name="urlVar")
    private @Nullable Output<String> urlVar;

    public Optional<Output<String>> urlVar() {
        return Optional.ofNullable(this.urlVar);
    }

    private GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs() {}

    private GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs(GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs $) {
        this.transformation = $.transformation;
        this.url = $.url;
        this.urlVar = $.urlVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder transformation(@Nullable Output<GetImagingPolicyImagePolicyTransformationArgs> transformation) {
            $.transformation = transformation;
            return this;
        }

        public Builder transformation(GetImagingPolicyImagePolicyTransformationArgs transformation) {
            return transformation(Output.of(transformation));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder urlVar(@Nullable Output<String> urlVar) {
            $.urlVar = urlVar;
            return this;
        }

        public Builder urlVar(String urlVar) {
            return urlVar(Output.of(urlVar));
        }

        public GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs build() {
            return $;
        }
    }

}
