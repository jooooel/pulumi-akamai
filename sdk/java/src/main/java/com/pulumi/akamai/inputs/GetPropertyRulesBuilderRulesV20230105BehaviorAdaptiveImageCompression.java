// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression();

    @Import(name="compressMobile")
    private @Nullable Boolean compressMobile;

    public Optional<Boolean> compressMobile() {
        return Optional.ofNullable(this.compressMobile);
    }

    @Import(name="compressStandard")
    private @Nullable Boolean compressStandard;

    public Optional<Boolean> compressStandard() {
        return Optional.ofNullable(this.compressStandard);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tier1MobileCompressionMethod")
    private @Nullable String tier1MobileCompressionMethod;

    public Optional<String> tier1MobileCompressionMethod() {
        return Optional.ofNullable(this.tier1MobileCompressionMethod);
    }

    @Import(name="tier1MobileCompressionValue")
    private @Nullable Integer tier1MobileCompressionValue;

    public Optional<Integer> tier1MobileCompressionValue() {
        return Optional.ofNullable(this.tier1MobileCompressionValue);
    }

    @Import(name="tier1StandardCompressionMethod")
    private @Nullable String tier1StandardCompressionMethod;

    public Optional<String> tier1StandardCompressionMethod() {
        return Optional.ofNullable(this.tier1StandardCompressionMethod);
    }

    @Import(name="tier1StandardCompressionValue")
    private @Nullable Integer tier1StandardCompressionValue;

    public Optional<Integer> tier1StandardCompressionValue() {
        return Optional.ofNullable(this.tier1StandardCompressionValue);
    }

    @Import(name="tier2MobileCompressionMethod")
    private @Nullable String tier2MobileCompressionMethod;

    public Optional<String> tier2MobileCompressionMethod() {
        return Optional.ofNullable(this.tier2MobileCompressionMethod);
    }

    @Import(name="tier2MobileCompressionValue")
    private @Nullable Integer tier2MobileCompressionValue;

    public Optional<Integer> tier2MobileCompressionValue() {
        return Optional.ofNullable(this.tier2MobileCompressionValue);
    }

    @Import(name="tier2StandardCompressionMethod")
    private @Nullable String tier2StandardCompressionMethod;

    public Optional<String> tier2StandardCompressionMethod() {
        return Optional.ofNullable(this.tier2StandardCompressionMethod);
    }

    @Import(name="tier2StandardCompressionValue")
    private @Nullable Integer tier2StandardCompressionValue;

    public Optional<Integer> tier2StandardCompressionValue() {
        return Optional.ofNullable(this.tier2StandardCompressionValue);
    }

    @Import(name="tier3MobileCompressionMethod")
    private @Nullable String tier3MobileCompressionMethod;

    public Optional<String> tier3MobileCompressionMethod() {
        return Optional.ofNullable(this.tier3MobileCompressionMethod);
    }

    @Import(name="tier3MobileCompressionValue")
    private @Nullable Integer tier3MobileCompressionValue;

    public Optional<Integer> tier3MobileCompressionValue() {
        return Optional.ofNullable(this.tier3MobileCompressionValue);
    }

    @Import(name="tier3StandardCompressionMethod")
    private @Nullable String tier3StandardCompressionMethod;

    public Optional<String> tier3StandardCompressionMethod() {
        return Optional.ofNullable(this.tier3StandardCompressionMethod);
    }

    @Import(name="tier3StandardCompressionValue")
    private @Nullable Integer tier3StandardCompressionValue;

    public Optional<Integer> tier3StandardCompressionValue() {
        return Optional.ofNullable(this.tier3StandardCompressionValue);
    }

    @Import(name="titleAicMobile")
    private @Nullable String titleAicMobile;

    public Optional<String> titleAicMobile() {
        return Optional.ofNullable(this.titleAicMobile);
    }

    @Import(name="titleAicNonmobile")
    private @Nullable String titleAicNonmobile;

    public Optional<String> titleAicNonmobile() {
        return Optional.ofNullable(this.titleAicNonmobile);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression(GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression $) {
        this.compressMobile = $.compressMobile;
        this.compressStandard = $.compressStandard;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.tier1MobileCompressionMethod = $.tier1MobileCompressionMethod;
        this.tier1MobileCompressionValue = $.tier1MobileCompressionValue;
        this.tier1StandardCompressionMethod = $.tier1StandardCompressionMethod;
        this.tier1StandardCompressionValue = $.tier1StandardCompressionValue;
        this.tier2MobileCompressionMethod = $.tier2MobileCompressionMethod;
        this.tier2MobileCompressionValue = $.tier2MobileCompressionValue;
        this.tier2StandardCompressionMethod = $.tier2StandardCompressionMethod;
        this.tier2StandardCompressionValue = $.tier2StandardCompressionValue;
        this.tier3MobileCompressionMethod = $.tier3MobileCompressionMethod;
        this.tier3MobileCompressionValue = $.tier3MobileCompressionValue;
        this.tier3StandardCompressionMethod = $.tier3StandardCompressionMethod;
        this.tier3StandardCompressionValue = $.tier3StandardCompressionValue;
        this.titleAicMobile = $.titleAicMobile;
        this.titleAicNonmobile = $.titleAicNonmobile;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression(Objects.requireNonNull(defaults));
        }

        public Builder compressMobile(@Nullable Boolean compressMobile) {
            $.compressMobile = compressMobile;
            return this;
        }

        public Builder compressStandard(@Nullable Boolean compressStandard) {
            $.compressStandard = compressStandard;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder tier1MobileCompressionMethod(@Nullable String tier1MobileCompressionMethod) {
            $.tier1MobileCompressionMethod = tier1MobileCompressionMethod;
            return this;
        }

        public Builder tier1MobileCompressionValue(@Nullable Integer tier1MobileCompressionValue) {
            $.tier1MobileCompressionValue = tier1MobileCompressionValue;
            return this;
        }

        public Builder tier1StandardCompressionMethod(@Nullable String tier1StandardCompressionMethod) {
            $.tier1StandardCompressionMethod = tier1StandardCompressionMethod;
            return this;
        }

        public Builder tier1StandardCompressionValue(@Nullable Integer tier1StandardCompressionValue) {
            $.tier1StandardCompressionValue = tier1StandardCompressionValue;
            return this;
        }

        public Builder tier2MobileCompressionMethod(@Nullable String tier2MobileCompressionMethod) {
            $.tier2MobileCompressionMethod = tier2MobileCompressionMethod;
            return this;
        }

        public Builder tier2MobileCompressionValue(@Nullable Integer tier2MobileCompressionValue) {
            $.tier2MobileCompressionValue = tier2MobileCompressionValue;
            return this;
        }

        public Builder tier2StandardCompressionMethod(@Nullable String tier2StandardCompressionMethod) {
            $.tier2StandardCompressionMethod = tier2StandardCompressionMethod;
            return this;
        }

        public Builder tier2StandardCompressionValue(@Nullable Integer tier2StandardCompressionValue) {
            $.tier2StandardCompressionValue = tier2StandardCompressionValue;
            return this;
        }

        public Builder tier3MobileCompressionMethod(@Nullable String tier3MobileCompressionMethod) {
            $.tier3MobileCompressionMethod = tier3MobileCompressionMethod;
            return this;
        }

        public Builder tier3MobileCompressionValue(@Nullable Integer tier3MobileCompressionValue) {
            $.tier3MobileCompressionValue = tier3MobileCompressionValue;
            return this;
        }

        public Builder tier3StandardCompressionMethod(@Nullable String tier3StandardCompressionMethod) {
            $.tier3StandardCompressionMethod = tier3StandardCompressionMethod;
            return this;
        }

        public Builder tier3StandardCompressionValue(@Nullable Integer tier3StandardCompressionValue) {
            $.tier3StandardCompressionValue = tier3StandardCompressionValue;
            return this;
        }

        public Builder titleAicMobile(@Nullable String titleAicMobile) {
            $.titleAicMobile = titleAicMobile;
            return this;
        }

        public Builder titleAicNonmobile(@Nullable String titleAicNonmobile) {
            $.titleAicNonmobile = titleAicNonmobile;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorAdaptiveImageCompression build() {
            return $;
        }
    }

}