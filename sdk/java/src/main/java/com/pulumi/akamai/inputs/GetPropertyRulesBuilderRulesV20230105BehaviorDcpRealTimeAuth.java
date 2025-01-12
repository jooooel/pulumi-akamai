// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth();

    @Import(name="extractHostname")
    private @Nullable Boolean extractHostname;

    public Optional<Boolean> extractHostname() {
        return Optional.ofNullable(this.extractHostname);
    }

    @Import(name="extractJurisdiction")
    private @Nullable Boolean extractJurisdiction;

    public Optional<Boolean> extractJurisdiction() {
        return Optional.ofNullable(this.extractJurisdiction);
    }

    @Import(name="extractNamespace")
    private @Nullable Boolean extractNamespace;

    public Optional<Boolean> extractNamespace() {
        return Optional.ofNullable(this.extractNamespace);
    }

    @Import(name="hostnameClaim")
    private @Nullable String hostnameClaim;

    public Optional<String> hostnameClaim() {
        return Optional.ofNullable(this.hostnameClaim);
    }

    @Import(name="jurisdictionClaim")
    private @Nullable String jurisdictionClaim;

    public Optional<String> jurisdictionClaim() {
        return Optional.ofNullable(this.jurisdictionClaim);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="namespaceClaim")
    private @Nullable String namespaceClaim;

    public Optional<String> namespaceClaim() {
        return Optional.ofNullable(this.namespaceClaim);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth(GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth $) {
        this.extractHostname = $.extractHostname;
        this.extractJurisdiction = $.extractJurisdiction;
        this.extractNamespace = $.extractNamespace;
        this.hostnameClaim = $.hostnameClaim;
        this.jurisdictionClaim = $.jurisdictionClaim;
        this.locked = $.locked;
        this.namespaceClaim = $.namespaceClaim;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth(Objects.requireNonNull(defaults));
        }

        public Builder extractHostname(@Nullable Boolean extractHostname) {
            $.extractHostname = extractHostname;
            return this;
        }

        public Builder extractJurisdiction(@Nullable Boolean extractJurisdiction) {
            $.extractJurisdiction = extractJurisdiction;
            return this;
        }

        public Builder extractNamespace(@Nullable Boolean extractNamespace) {
            $.extractNamespace = extractNamespace;
            return this;
        }

        public Builder hostnameClaim(@Nullable String hostnameClaim) {
            $.hostnameClaim = hostnameClaim;
            return this;
        }

        public Builder jurisdictionClaim(@Nullable String jurisdictionClaim) {
            $.jurisdictionClaim = jurisdictionClaim;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder namespaceClaim(@Nullable String namespaceClaim) {
            $.namespaceClaim = namespaceClaim;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuth build() {
            return $;
        }
    }

}
