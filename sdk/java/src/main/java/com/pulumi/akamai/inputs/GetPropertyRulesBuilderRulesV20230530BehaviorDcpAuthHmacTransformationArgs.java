// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs();

    @Import(name="hashConversionAlgorithm")
    private @Nullable Output<String> hashConversionAlgorithm;

    public Optional<Output<String>> hashConversionAlgorithm() {
        return Optional.ofNullable(this.hashConversionAlgorithm);
    }

    @Import(name="hashConversionKey")
    private @Nullable Output<String> hashConversionKey;

    public Optional<Output<String>> hashConversionKey() {
        return Optional.ofNullable(this.hashConversionKey);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs $) {
        this.hashConversionAlgorithm = $.hashConversionAlgorithm;
        this.hashConversionKey = $.hashConversionKey;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder hashConversionAlgorithm(@Nullable Output<String> hashConversionAlgorithm) {
            $.hashConversionAlgorithm = hashConversionAlgorithm;
            return this;
        }

        public Builder hashConversionAlgorithm(String hashConversionAlgorithm) {
            return hashConversionAlgorithm(Output.of(hashConversionAlgorithm));
        }

        public Builder hashConversionKey(@Nullable Output<String> hashConversionKey) {
            $.hashConversionKey = hashConversionKey;
            return this;
        }

        public Builder hashConversionKey(String hashConversionKey) {
            return hashConversionKey(Output.of(hashConversionKey));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthHmacTransformationArgs build() {
            return $;
        }
    }

}
