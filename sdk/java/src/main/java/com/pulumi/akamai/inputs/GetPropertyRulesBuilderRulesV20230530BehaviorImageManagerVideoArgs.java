// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformedArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs();

    @Import(name="advanced")
    private @Nullable Output<Boolean> advanced;

    public Optional<Output<Boolean>> advanced() {
        return Optional.ofNullable(this.advanced);
    }

    @Import(name="apiReferenceTitle")
    private @Nullable Output<String> apiReferenceTitle;

    public Optional<Output<String>> apiReferenceTitle() {
        return Optional.ofNullable(this.apiReferenceTitle);
    }

    @Import(name="applyBestFileType")
    private @Nullable Output<Boolean> applyBestFileType;

    public Optional<Output<Boolean>> applyBestFileType() {
        return Optional.ofNullable(this.applyBestFileType);
    }

    @Import(name="cpCodeOriginal")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalArgs> cpCodeOriginal;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalArgs>> cpCodeOriginal() {
        return Optional.ofNullable(this.cpCodeOriginal);
    }

    @Import(name="cpCodeTransformed")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformedArgs> cpCodeTransformed;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformedArgs>> cpCodeTransformed() {
        return Optional.ofNullable(this.cpCodeTransformed);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="policySet")
    private @Nullable Output<String> policySet;

    public Optional<Output<String>> policySet() {
        return Optional.ofNullable(this.policySet);
    }

    @Import(name="policyToken")
    private @Nullable Output<String> policyToken;

    public Optional<Output<String>> policyToken() {
        return Optional.ofNullable(this.policyToken);
    }

    @Import(name="policyTokenDefault")
    private @Nullable Output<String> policyTokenDefault;

    public Optional<Output<String>> policyTokenDefault() {
        return Optional.ofNullable(this.policyTokenDefault);
    }

    @Import(name="resize")
    private @Nullable Output<Boolean> resize;

    public Optional<Output<Boolean>> resize() {
        return Optional.ofNullable(this.resize);
    }

    @Import(name="settingsTitle")
    private @Nullable Output<String> settingsTitle;

    public Optional<Output<String>> settingsTitle() {
        return Optional.ofNullable(this.settingsTitle);
    }

    @Import(name="superCacheRegion")
    private @Nullable Output<String> superCacheRegion;

    public Optional<Output<String>> superCacheRegion() {
        return Optional.ofNullable(this.superCacheRegion);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="trafficTitle")
    private @Nullable Output<String> trafficTitle;

    public Optional<Output<String>> trafficTitle() {
        return Optional.ofNullable(this.trafficTitle);
    }

    @Import(name="useExistingPolicySet")
    private @Nullable Output<Boolean> useExistingPolicySet;

    public Optional<Output<Boolean>> useExistingPolicySet() {
        return Optional.ofNullable(this.useExistingPolicySet);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs $) {
        this.advanced = $.advanced;
        this.apiReferenceTitle = $.apiReferenceTitle;
        this.applyBestFileType = $.applyBestFileType;
        this.cpCodeOriginal = $.cpCodeOriginal;
        this.cpCodeTransformed = $.cpCodeTransformed;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.policySet = $.policySet;
        this.policyToken = $.policyToken;
        this.policyTokenDefault = $.policyTokenDefault;
        this.resize = $.resize;
        this.settingsTitle = $.settingsTitle;
        this.superCacheRegion = $.superCacheRegion;
        this.templateUuid = $.templateUuid;
        this.trafficTitle = $.trafficTitle;
        this.useExistingPolicySet = $.useExistingPolicySet;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs(Objects.requireNonNull(defaults));
        }

        public Builder advanced(@Nullable Output<Boolean> advanced) {
            $.advanced = advanced;
            return this;
        }

        public Builder advanced(Boolean advanced) {
            return advanced(Output.of(advanced));
        }

        public Builder apiReferenceTitle(@Nullable Output<String> apiReferenceTitle) {
            $.apiReferenceTitle = apiReferenceTitle;
            return this;
        }

        public Builder apiReferenceTitle(String apiReferenceTitle) {
            return apiReferenceTitle(Output.of(apiReferenceTitle));
        }

        public Builder applyBestFileType(@Nullable Output<Boolean> applyBestFileType) {
            $.applyBestFileType = applyBestFileType;
            return this;
        }

        public Builder applyBestFileType(Boolean applyBestFileType) {
            return applyBestFileType(Output.of(applyBestFileType));
        }

        public Builder cpCodeOriginal(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalArgs> cpCodeOriginal) {
            $.cpCodeOriginal = cpCodeOriginal;
            return this;
        }

        public Builder cpCodeOriginal(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalArgs cpCodeOriginal) {
            return cpCodeOriginal(Output.of(cpCodeOriginal));
        }

        public Builder cpCodeTransformed(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformedArgs> cpCodeTransformed) {
            $.cpCodeTransformed = cpCodeTransformed;
            return this;
        }

        public Builder cpCodeTransformed(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformedArgs cpCodeTransformed) {
            return cpCodeTransformed(Output.of(cpCodeTransformed));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder policySet(@Nullable Output<String> policySet) {
            $.policySet = policySet;
            return this;
        }

        public Builder policySet(String policySet) {
            return policySet(Output.of(policySet));
        }

        public Builder policyToken(@Nullable Output<String> policyToken) {
            $.policyToken = policyToken;
            return this;
        }

        public Builder policyToken(String policyToken) {
            return policyToken(Output.of(policyToken));
        }

        public Builder policyTokenDefault(@Nullable Output<String> policyTokenDefault) {
            $.policyTokenDefault = policyTokenDefault;
            return this;
        }

        public Builder policyTokenDefault(String policyTokenDefault) {
            return policyTokenDefault(Output.of(policyTokenDefault));
        }

        public Builder resize(@Nullable Output<Boolean> resize) {
            $.resize = resize;
            return this;
        }

        public Builder resize(Boolean resize) {
            return resize(Output.of(resize));
        }

        public Builder settingsTitle(@Nullable Output<String> settingsTitle) {
            $.settingsTitle = settingsTitle;
            return this;
        }

        public Builder settingsTitle(String settingsTitle) {
            return settingsTitle(Output.of(settingsTitle));
        }

        public Builder superCacheRegion(@Nullable Output<String> superCacheRegion) {
            $.superCacheRegion = superCacheRegion;
            return this;
        }

        public Builder superCacheRegion(String superCacheRegion) {
            return superCacheRegion(Output.of(superCacheRegion));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder trafficTitle(@Nullable Output<String> trafficTitle) {
            $.trafficTitle = trafficTitle;
            return this;
        }

        public Builder trafficTitle(String trafficTitle) {
            return trafficTitle(Output.of(trafficTitle));
        }

        public Builder useExistingPolicySet(@Nullable Output<Boolean> useExistingPolicySet) {
            $.useExistingPolicySet = useExistingPolicySet;
            return this;
        }

        public Builder useExistingPolicySet(Boolean useExistingPolicySet) {
            return useExistingPolicySet(Output.of(useExistingPolicySet));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoArgs build() {
            return $;
        }
    }

}