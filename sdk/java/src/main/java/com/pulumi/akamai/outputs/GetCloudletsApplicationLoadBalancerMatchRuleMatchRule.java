// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting;
import com.pulumi.akamai.outputs.GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudletsApplicationLoadBalancerMatchRuleMatchRule {
    private @Nullable Boolean disabled;
    private @Nullable Integer end;
    private List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting> forwardSettings;
    private @Nullable Integer id;
    private @Nullable String matchUrl;
    private @Nullable List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch> matches;
    private @Nullable Boolean matchesAlways;
    private @Nullable String name;
    private @Nullable Integer start;
    private String type;

    private GetCloudletsApplicationLoadBalancerMatchRuleMatchRule() {}
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }
    public List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting> forwardSettings() {
        return this.forwardSettings;
    }
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> matchUrl() {
        return Optional.ofNullable(this.matchUrl);
    }
    public List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch> matches() {
        return this.matches == null ? List.of() : this.matches;
    }
    public Optional<Boolean> matchesAlways() {
        return Optional.ofNullable(this.matchesAlways);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudletsApplicationLoadBalancerMatchRuleMatchRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable Integer end;
        private List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting> forwardSettings;
        private @Nullable Integer id;
        private @Nullable String matchUrl;
        private @Nullable List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch> matches;
        private @Nullable Boolean matchesAlways;
        private @Nullable String name;
        private @Nullable Integer start;
        private String type;
        public Builder() {}
        public Builder(GetCloudletsApplicationLoadBalancerMatchRuleMatchRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.end = defaults.end;
    	      this.forwardSettings = defaults.forwardSettings;
    	      this.id = defaults.id;
    	      this.matchUrl = defaults.matchUrl;
    	      this.matches = defaults.matches;
    	      this.matchesAlways = defaults.matchesAlways;
    	      this.name = defaults.name;
    	      this.start = defaults.start;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable Integer end) {
            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder forwardSettings(List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting> forwardSettings) {
            this.forwardSettings = Objects.requireNonNull(forwardSettings);
            return this;
        }
        public Builder forwardSettings(GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleForwardSetting... forwardSettings) {
            return forwardSettings(List.of(forwardSettings));
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder matchUrl(@Nullable String matchUrl) {
            this.matchUrl = matchUrl;
            return this;
        }
        @CustomType.Setter
        public Builder matches(@Nullable List<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch> matches) {
            this.matches = matches;
            return this;
        }
        public Builder matches(GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatch... matches) {
            return matches(List.of(matches));
        }
        @CustomType.Setter
        public Builder matchesAlways(@Nullable Boolean matchesAlways) {
            this.matchesAlways = matchesAlways;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable Integer start) {
            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCloudletsApplicationLoadBalancerMatchRuleMatchRule build() {
            final var _resultValue = new GetCloudletsApplicationLoadBalancerMatchRuleMatchRule();
            _resultValue.disabled = disabled;
            _resultValue.end = end;
            _resultValue.forwardSettings = forwardSettings;
            _resultValue.id = id;
            _resultValue.matchUrl = matchUrl;
            _resultValue.matches = matches;
            _resultValue.matchesAlways = matchesAlways;
            _resultValue.name = name;
            _resultValue.start = start;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
