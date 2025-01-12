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
    public sealed class GetCloudletsRequestControlMatchRuleMatchRuleResult
    {
        public readonly string AllowDeny;
        public readonly bool? Disabled;
        public readonly int? End;
        public readonly ImmutableArray<Outputs.GetCloudletsRequestControlMatchRuleMatchRuleMatchResult> Matches;
        public readonly bool? MatchesAlways;
        public readonly string? Name;
        public readonly int? Start;
        public readonly string Type;

        [OutputConstructor]
        private GetCloudletsRequestControlMatchRuleMatchRuleResult(
            string allowDeny,

            bool? disabled,

            int? end,

            ImmutableArray<Outputs.GetCloudletsRequestControlMatchRuleMatchRuleMatchResult> matches,

            bool? matchesAlways,

            string? name,

            int? start,

            string type)
        {
            AllowDeny = allowDeny;
            Disabled = disabled;
            End = end;
            Matches = matches;
            MatchesAlways = matchesAlways;
            Name = name;
            Start = start;
            Type = type;
        }
    }
}
