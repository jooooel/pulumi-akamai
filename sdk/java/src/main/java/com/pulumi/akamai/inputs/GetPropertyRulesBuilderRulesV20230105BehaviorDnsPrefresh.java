// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh();

    @Import(name="delay")
    private @Nullable String delay;

    public Optional<String> delay() {
        return Optional.ofNullable(this.delay);
    }

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

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="timeout")
    private @Nullable String timeout;

    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh(GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh $) {
        this.delay = $.delay;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.timeout = $.timeout;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh(Objects.requireNonNull(defaults));
        }

        public Builder delay(@Nullable String delay) {
            $.delay = delay;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
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

        public Builder timeout(@Nullable String timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDnsPrefresh build() {
            return $;
        }
    }

}