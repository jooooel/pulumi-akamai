// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorCacheError extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorCacheError Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheError();

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="preserveStale")
    private @Nullable Boolean preserveStale;

    public Optional<Boolean> preserveStale() {
        return Optional.ofNullable(this.preserveStale);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="ttl")
    private @Nullable String ttl;

    public Optional<String> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorCacheError() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorCacheError(GetPropertyRulesBuilderRulesV20230530BehaviorCacheError $) {
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.preserveStale = $.preserveStale;
        this.templateUuid = $.templateUuid;
        this.ttl = $.ttl;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorCacheError $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheError();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheError defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheError(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder preserveStale(@Nullable Boolean preserveStale) {
            $.preserveStale = preserveStale;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder ttl(@Nullable String ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorCacheError build() {
            return $;
        }
    }

}
