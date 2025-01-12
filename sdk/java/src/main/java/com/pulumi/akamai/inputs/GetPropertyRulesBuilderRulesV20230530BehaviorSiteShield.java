// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmap;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="nossmap")
    private @Nullable String nossmap;

    public Optional<String> nossmap() {
        return Optional.ofNullable(this.nossmap);
    }

    @Import(name="ssmap")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmap ssmap;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmap> ssmap() {
        return Optional.ofNullable(this.ssmap);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield $) {
        this.locked = $.locked;
        this.nossmap = $.nossmap;
        this.ssmap = $.ssmap;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder nossmap(@Nullable String nossmap) {
            $.nossmap = nossmap;
            return this;
        }

        public Builder ssmap(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmap ssmap) {
            $.ssmap = ssmap;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorSiteShield build() {
            return $;
        }
    }

}
