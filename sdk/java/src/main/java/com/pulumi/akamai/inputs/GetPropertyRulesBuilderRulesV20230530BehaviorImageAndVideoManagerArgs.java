// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeOriginalArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs();

    @Import(name="applyBestFileType")
    private @Nullable Output<Boolean> applyBestFileType;

    public Optional<Output<Boolean>> applyBestFileType() {
        return Optional.ofNullable(this.applyBestFileType);
    }

    @Import(name="cpCodeOriginal")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeOriginalArgs> cpCodeOriginal;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeOriginalArgs>> cpCodeOriginal() {
        return Optional.ofNullable(this.cpCodeOriginal);
    }

    @Import(name="cpCodeTransformed")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedArgs> cpCodeTransformed;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedArgs>> cpCodeTransformed() {
        return Optional.ofNullable(this.cpCodeTransformed);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="imageSet")
    private @Nullable Output<String> imageSet;

    public Optional<Output<String>> imageSet() {
        return Optional.ofNullable(this.imageSet);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="policySetType")
    private @Nullable Output<String> policySetType;

    public Optional<Output<String>> policySetType() {
        return Optional.ofNullable(this.policySetType);
    }

    @Import(name="resize")
    private @Nullable Output<Boolean> resize;

    public Optional<Output<Boolean>> resize() {
        return Optional.ofNullable(this.resize);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="videoSet")
    private @Nullable Output<String> videoSet;

    public Optional<Output<String>> videoSet() {
        return Optional.ofNullable(this.videoSet);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs $) {
        this.applyBestFileType = $.applyBestFileType;
        this.cpCodeOriginal = $.cpCodeOriginal;
        this.cpCodeTransformed = $.cpCodeTransformed;
        this.enabled = $.enabled;
        this.imageSet = $.imageSet;
        this.locked = $.locked;
        this.policySetType = $.policySetType;
        this.resize = $.resize;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.videoSet = $.videoSet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyBestFileType(@Nullable Output<Boolean> applyBestFileType) {
            $.applyBestFileType = applyBestFileType;
            return this;
        }

        public Builder applyBestFileType(Boolean applyBestFileType) {
            return applyBestFileType(Output.of(applyBestFileType));
        }

        public Builder cpCodeOriginal(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeOriginalArgs> cpCodeOriginal) {
            $.cpCodeOriginal = cpCodeOriginal;
            return this;
        }

        public Builder cpCodeOriginal(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeOriginalArgs cpCodeOriginal) {
            return cpCodeOriginal(Output.of(cpCodeOriginal));
        }

        public Builder cpCodeTransformed(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedArgs> cpCodeTransformed) {
            $.cpCodeTransformed = cpCodeTransformed;
            return this;
        }

        public Builder cpCodeTransformed(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedArgs cpCodeTransformed) {
            return cpCodeTransformed(Output.of(cpCodeTransformed));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder imageSet(@Nullable Output<String> imageSet) {
            $.imageSet = imageSet;
            return this;
        }

        public Builder imageSet(String imageSet) {
            return imageSet(Output.of(imageSet));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder policySetType(@Nullable Output<String> policySetType) {
            $.policySetType = policySetType;
            return this;
        }

        public Builder policySetType(String policySetType) {
            return policySetType(Output.of(policySetType));
        }

        public Builder resize(@Nullable Output<Boolean> resize) {
            $.resize = resize;
            return this;
        }

        public Builder resize(Boolean resize) {
            return resize(Output.of(resize));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder videoSet(@Nullable Output<String> videoSet) {
            $.videoSet = videoSet;
            return this;
        }

        public Builder videoSet(String videoSet) {
            return videoSet(Output.of(videoSet));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerArgs build() {
            return $;
        }
    }

}
