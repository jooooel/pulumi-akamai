// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetCloudletsForwardRewriteMatchRuleMatchRuleResult
    {
        public readonly bool? Disabled;
        public readonly int? End;
        public readonly Outputs.GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsResult ForwardSettings;
        public readonly string? MatchUrl;
        public readonly ImmutableArray<Outputs.GetCloudletsForwardRewriteMatchRuleMatchRuleMatchResult> Matches;
        public readonly string? Name;
        public readonly int? Start;
        public readonly string Type;

        [OutputConstructor]
        private GetCloudletsForwardRewriteMatchRuleMatchRuleResult(
            bool? disabled,

            int? end,

            Outputs.GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsResult forwardSettings,

            string? matchUrl,

            ImmutableArray<Outputs.GetCloudletsForwardRewriteMatchRuleMatchRuleMatchResult> matches,

            string? name,

            int? start,

            string type)
        {
            Disabled = disabled;
            End = end;
            ForwardSettings = forwardSettings;
            MatchUrl = matchUrl;
            Matches = matches;
            Name = name;
            Start = start;
            Type = type;
        }
    }
}
