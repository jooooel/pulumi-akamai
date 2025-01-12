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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity();

    @Import(name="enable")
    private @Nullable Boolean enable;

    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="includeSubDomains")
    private @Nullable Boolean includeSubDomains;

    public Optional<Boolean> includeSubDomains() {
        return Optional.ofNullable(this.includeSubDomains);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="maxAge")
    private @Nullable String maxAge;

    public Optional<String> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    @Import(name="preload")
    private @Nullable Boolean preload;

    public Optional<Boolean> preload() {
        return Optional.ofNullable(this.preload);
    }

    @Import(name="redirect")
    private @Nullable Boolean redirect;

    public Optional<Boolean> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    @Import(name="redirectStatusCode")
    private @Nullable Integer redirectStatusCode;

    public Optional<Integer> redirectStatusCode() {
        return Optional.ofNullable(this.redirectStatusCode);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity(GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity $) {
        this.enable = $.enable;
        this.includeSubDomains = $.includeSubDomains;
        this.locked = $.locked;
        this.maxAge = $.maxAge;
        this.preload = $.preload;
        this.redirect = $.redirect;
        this.redirectStatusCode = $.redirectStatusCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Boolean enable) {
            $.enable = enable;
            return this;
        }

        public Builder includeSubDomains(@Nullable Boolean includeSubDomains) {
            $.includeSubDomains = includeSubDomains;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder maxAge(@Nullable String maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        public Builder preload(@Nullable Boolean preload) {
            $.preload = preload;
            return this;
        }

        public Builder redirect(@Nullable Boolean redirect) {
            $.redirect = redirect;
            return this;
        }

        public Builder redirectStatusCode(@Nullable Integer redirectStatusCode) {
            $.redirectStatusCode = redirectStatusCode;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorHttpStrictTransportSecurity build() {
            return $;
        }
    }

}
