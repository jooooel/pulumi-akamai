// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile();

    @Import(name="catalogSize")
    private @Nullable String catalogSize;

    public Optional<String> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }

    @Import(name="contentType")
    private @Nullable String contentType;

    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="objectSize")
    private @Nullable String objectSize;

    public Optional<String> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }

    @Import(name="popularityDistribution")
    private @Nullable String popularityDistribution;

    public Optional<String> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile $) {
        this.catalogSize = $.catalogSize;
        this.contentType = $.contentType;
        this.locked = $.locked;
        this.objectSize = $.objectSize;
        this.popularityDistribution = $.popularityDistribution;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile(Objects.requireNonNull(defaults));
        }

        public Builder catalogSize(@Nullable String catalogSize) {
            $.catalogSize = catalogSize;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder objectSize(@Nullable String objectSize) {
            $.objectSize = objectSize;
            return this;
        }

        public Builder popularityDistribution(@Nullable String popularityDistribution) {
            $.popularityDistribution = popularityDistribution;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdLargeFile build() {
            return $;
        }
    }

}
