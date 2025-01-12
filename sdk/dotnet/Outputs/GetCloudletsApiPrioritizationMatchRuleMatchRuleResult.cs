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
    public sealed class GetCloudletsApiPrioritizationMatchRuleMatchRuleResult
    {
        public readonly bool? Disabled;
        public readonly int? End;
        public readonly string? MatchUrl;
        public readonly ImmutableArray<Outputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchResult> Matches;
        public readonly string? Name;
        public readonly double PassThroughPercent;
        public readonly int? Start;
        public readonly string Type;

        [OutputConstructor]
        private GetCloudletsApiPrioritizationMatchRuleMatchRuleResult(
            bool? disabled,

            int? end,

            string? matchUrl,

            ImmutableArray<Outputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchResult> matches,

            string? name,

            double passThroughPercent,

            int? start,

            string type)
        {
            Disabled = disabled;
            End = end;
            MatchUrl = matchUrl;
            Matches = matches;
            Name = name;
            PassThroughPercent = passThroughPercent;
            Start = start;
            Type = type;
        }
    }
}
