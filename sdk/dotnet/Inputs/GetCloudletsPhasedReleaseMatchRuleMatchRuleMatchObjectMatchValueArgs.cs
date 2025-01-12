// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchObjectMatchValueInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nameCaseSensitive")]
        public Input<bool>? NameCaseSensitive { get; set; }

        [Input("nameHasWildcard")]
        public Input<bool>? NameHasWildcard { get; set; }

        [Input("options")]
        public Input<Inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchObjectMatchValueOptionsInputArgs>? Options { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("values")]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchObjectMatchValueInputArgs()
        {
        }
        public static new GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchObjectMatchValueInputArgs Empty => new GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchObjectMatchValueInputArgs();
    }
}
