// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="responseHeaderName")
    private @Nullable String responseHeaderName;

    public Optional<String> responseHeaderName() {
        return Optional.ofNullable(this.responseHeaderName);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus(GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus $) {
        this.locked = $.locked;
        this.responseHeaderName = $.responseHeaderName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder responseHeaderName(@Nullable String responseHeaderName) {
            $.responseHeaderName = responseHeaderName;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorReturnCacheStatus build() {
            return $;
        }
    }

}